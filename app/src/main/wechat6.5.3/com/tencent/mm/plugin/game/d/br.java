package com.tencent.mm.plugin.game.d;

import a.a.a.b;
import com.tencent.mm.ba.a;

public final class br extends a {
    public String aXz;
    public String gkT;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.aXz == null) {
                throw new b("Not all required fields were included: Title");
            }
            if (this.aXz != null) {
                aVar.e(1, this.aXz);
            }
            if (this.gkT == null) {
                return 0;
            }
            aVar.e(2, this.gkT);
            return 0;
        } else if (i == 1) {
            if (this.aXz != null) {
                r0 = a.a.a.b.b.a.f(1, this.aXz) + 0;
            } else {
                r0 = 0;
            }
            if (this.gkT != null) {
                r0 += a.a.a.b.b.a.f(2, this.gkT);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.aXz != null) {
                return 0;
            }
            throw new b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            br brVar = (br) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    brVar.aXz = aVar3.pMj.readString();
                    return 0;
                case 2:
                    brVar.gkT = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
