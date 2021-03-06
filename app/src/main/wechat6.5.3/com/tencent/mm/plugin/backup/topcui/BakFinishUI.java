package com.tencent.mm.plugin.backup.topcui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.TextView;
import com.tencent.mm.plugin.backup.bakpcmodel.c.e;
import com.tencent.mm.plugin.backup.bakpcmodel.d;
import com.tencent.mm.plugin.backup.g.b;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.ui.MMWizardActivity;

public class BakFinishUI extends MMWizardActivity implements e {
    private int edl;
    private TextView emF;
    private ac handler = new ac(Looper.getMainLooper());

    protected final int getLayoutId() {
        return 2130903157;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
            this.edl = getIntent().getIntExtra("cmd", -1);
            v.i("MicroMsg.BakFinishUI", "BakFinishUI onCreate nowCmd:%d", new Object[]{Integer.valueOf(this.edl)});
            NI();
            b.UK().egc = this;
        }
    }

    protected final void NI() {
        vD(2131231310);
        this.emF = (TextView) findViewById(2131755539);
        if (6 == this.edl) {
            this.emF.setText(getString(2131231306));
        } else if (1 == this.edl) {
            this.emF.setText(getString(2131231297));
        }
        b(new OnMenuItemClickListener(this) {
            final /* synthetic */ BakFinishUI emG;

            {
                this.emG = r1;
            }

            public final boolean onMenuItemClick(MenuItem menuItem) {
                b.UK().egj = d.egy;
                this.emG.bAv();
                return true;
            }
        });
    }

    public void onDestroy() {
        super.onDestroy();
        b.UK().egc = null;
        v.i("MicroMsg.BakFinishUI", "BakFinishUI onDestroy nowCmd:%d", new Object[]{Integer.valueOf(this.edl)});
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        b.UK().egj = d.egy;
        bAv();
        return true;
    }

    public final void UE() {
        this.handler.post(new Runnable(this) {
            final /* synthetic */ BakFinishUI emG;

            {
                this.emG = r1;
            }

            public final void run() {
                b.UK().egj = d.egy;
                this.emG.bAv();
            }
        });
    }

    public final void onError(int i) {
        this.handler.post(new Runnable(this) {
            final /* synthetic */ BakFinishUI emG;

            {
                this.emG = r1;
            }

            public final void run() {
                v.d("MicroMsg.BakFinishUI", "BakFinishUI onCloseSocket");
                MMWizardActivity.w(this.emG, new Intent(this.emG, BakConnErrorUI.class));
            }
        });
    }
}
