package com.tencent.mm.plugin.wallet.pay.a.c;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.l;

public final class c extends e {
    public c(l lVar, Orders orders) {
        super(lVar, orders);
    }

    public final String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_ff_verify";
    }

    public final int zg() {
        return 1591;
    }
}
