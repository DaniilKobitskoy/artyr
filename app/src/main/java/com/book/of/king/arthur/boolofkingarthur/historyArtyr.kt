package com.book.of.king.arthur.boolofkingarthur

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.webkit.*
import androidx.annotation.RequiresApi
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.book.of.king.arthur.boolofkingarthur.databinding.HistoryartyrBinding
import com.book.of.king.arthur.boolofkingarthur.fragment.menu
import com.book.of.king.arthur.boolofkingarthur.keyStore.keyStoreMain.key
import com.book.of.king.arthur.boolofkingarthur.pak.adapter.tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import org.json.JSONObject
import java.util.*


lateinit var gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds: HistoryartyrBinding
var gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs: String? = null
lateinit var fldhsfkdshgfkgsdfkgkdsFUYSFDHG: Map<String, Any>
var gone1 = View.GONE
var visible2 = View.VISIBLE



class historyArtyr : AppCompatActivity() {
    var sfdajhbkdgksuhdfjksugdkhfjaksf: String? = null
    var sgfdajhfnlskjfkdjhfahgkfahdjdsf: String? = null
    var smfjhdfnlkjdsghjfdbgfdkjhgjsf: String? = null
    var sfdjhfjsdkfjhkdhjgfsjkdfndakjfsfdsdf: Boolean = false
    var rgtsfgtrtwfdgwtrgsf: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds = HistoryartyrBinding.inflate(layoutInflater)
        setContentView(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.root)

       opens()



        val fsgkdjgjfdgjfsigjksdlffhufdgfjkadfsdf = AnimationUtils.loadAnimation(this, R.anim.fakeanimtext)
        gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.startAnimation(fsgkdjgjfdgjfsigjksdlffhufdgfjkadfsdf)
        fsgkdjgjfdgjfsigjksdlffhufdgfjkadfsdf.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(esrfjkdfiudhguhrdfgsf: Animation?) {
            }

            override fun onAnimationEnd(kgfdsghgfbgrsfdgfhgd: Animation?) {
                rtyukjhgrshtrjfhdgrs()
            }
            override fun onAnimationRepeat(defrtyjyybgsrfg: Animation?) {
            }
        })
        val sfgkjdhskfjdsuyjgshfhksfsfawd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs = sfgkjdhskfjdsuyjgshfhksfsfawd

        skgfjkfsldkgjhksglkdjdlfdsf()

    }

    private fun opens() {
        supportFragmentManager
            .beginTransaction()
            .replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, menu())
            .commit()
    }


    private fun fskdjsfhlifdjkahgldgsfkuysgfasf() {
        AppsFlyerLib.getInstance().setDebugLog(true)
        val dgfsdiedgfjfdsiufhlsif: AppsFlyerConversionListener = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(gfzdsfhjkhlfdkjhgflsfkjhdzvdzc: Map<String, Any>) {
                try {
                    fldhsfkdshgfkgsdfkgkdsFUYSFDHG = gfzdsfhjkhlfdkjhgflsfkjhdzvdzc
                    gfdlsjhflnkjdlgksdlffsdgs()

                } catch (jhgffdgdhgjkjhmngfdgsdfjkgdgf: Exception) {
                    jhgffdgdhgjkjhmngfdgsdfjkgdgf.printStackTrace()
                }
            }

            override fun onConversionDataFail(gthyjukjhgfdgthyjkjjfgsgdf: String) {
                runOnUiThread {
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = visible2
                    tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                }
            }

            override fun onAppOpenAttribution(dshgasduygdsufyadas: Map<String, String>) {
                runOnUiThread {
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = visible2
                    tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                }
            }

            override fun onAttributionFailure(asdfghdgfsasgdvdfgvgfdg: String) {
                runOnUiThread {
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = visible2
                    tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                }
            }
        }
        AppsFlyerLib.getInstance().init(key.initAppsFlyer, dgfsdiedgfjfdsiufhlsif, this)
        AppsFlyerLib.getInstance().registerConversionListener(this, dgfsdiedgfjfdsiufhlsif)
        AppsFlyerLib.getInstance().start(this)
    }

    private fun rtyukjhgrshtrjfhdgrs() {
        FirebaseDatabase.getInstance()
            .getReference("otkritieWebki")
            .child("otkritiewebkiboolean")
            .addValueEventListener(object :
            ValueEventListener {
            override fun onDataChange(fhgfefgdsfeagrhdgbfdsghgffdfasrfgv: DataSnapshot) {
                if (fhgfefgdsfeagrhdgbfdsghgffdfasrfgv.exists()) {
                    val dffjgdsfghksuhgdkduhfgsad = fhgfefgdsfeagrhdgbfdsghgffdfasrfgv.getValue(Boolean::class.java)

                    if (dffjgdsfghksuhgdkduhfgsad == true){
                        FirebaseDatabase.getInstance()
                            .getReference("otkritieWebki")
                            .child("fbAppInit")
                            .addValueEventListener(object :
                            ValueEventListener {
                           @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(sfdsyhghkujdfghsad: DataSnapshot) {
                                if (sfdsyhghkujdfghsad.exists()) {

                                    val fdkshsjofifdjpaoifodiufsakd = sfdsyhghkujdfghsad.getValue(Long::class.java)
                                    rgtsfgtrtwfdgwtrgsf = fdkshsjofifdjpaoifodiufsakd.toString()
                                    tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                                }
                            }

                            override fun onCancelled(sgfgsjhdnlfkjhfdlkgajsfadsd: DatabaseError) {
                                tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                            }
                        })

                        FirebaseDatabase.getInstance()
                            .getReference("otkritieWebki")
                            .child("loadSilkaNaWebky1")
                            .addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(hgbfvdsfghjgfderhgsdvdfgfdvdg: DataSnapshot) {
                                if (hgbfvdsfghjgfderhgsdvdfgfdvdg.exists()) {
                                    sgfdajhfnlskjfkdjhfahgkfahdjdsf = hgbfvdsfghjgfderhgsdvdfgfdvdg
                                        .getValue(String::class.java)
                                    tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                                }
                            }

                            override fun onCancelled(sfdshgajsgudyjhgfsaksdkjdhsgsfdfasd: DatabaseError) {
                                tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                            }
                        })
                        FirebaseDatabase.getInstance()
                            .getReference("otkritieWebki")
                            .child("loadSilkaNaWebky2")
                            .addValueEventListener(object :
                            ValueEventListener {
                            @SuppressLint("SetJavaScriptEnabled", "CutPasteId")
                            override fun onDataChange(sfdhsgfhbajskdhksffdujhgaslkdsadasdsad: DataSnapshot) {
                                if (sfdhsgfhbajskdhksffdujhgaslkdsadasdsad.exists()) {
                                    smfjhdfnlkjdsghjfdbgfdkjhgjsf = sfdhsgfhbajskdhksffdujhgaslkdsadasdsad
                                        .getValue(String::class.java)
                                    tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                                    dgsfgdushjgfdilksjfsdghfsdflsad()
                                }
                            }

                            override fun onCancelled(ghjhgfddrtyuyjnhgbegtjryntgrfdfg: DatabaseError) {
                                tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                            }
                        })

                    }else{
                        tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
                        gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                        gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                        gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = visible2

                    }
                }
            }

            override fun onCancelled(zffdsagsdgjhmjhfdgsghjhmjbnfdh: DatabaseError) {
                tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
            }
        })

    }

    private fun dgsfgdushjgfdilksjfsdghfsdflsad() {
        gfkhjfdakughskfdujghsliufklsf()
        sfdhsjffdjhglfifdhgikfjhkdfgjkdsfhalisufd(gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs!!)
        fskdjsfhlifdjkahgldgsfkuysgfasf()
        tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
    }

    private fun gfdlsjhflnkjdlgksdlffsdgs() {
        tyujfhgrfedfrgthyjhngbfrthrdbsafegrethdfsdw()
        val gfdgfjhfdliaughlfdghsldfjdsfsfd = Volley
            .newRequestQueue(this)
        val fdfydtshgfkfduhgjhskfgddfyusadasd = JSONObject()
        fdfydtshgfkfduhgjhskfgddfyusadasd
            .put("appsFlyerId", gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs)
        val dsfdhjsughsidhfaifjkasdad = JSONObject(fldhsfkdshgfkgsdfkgkdsFUYSFDHG)
        fdfydtshgfkfduhgjhskfgddfyusadasd
            .put("apsInfo", dsfdhjsughsidhfaifjkasdad)
        fdfydtshgfkfduhgjhskfgddfyusadasd
            .put("deeplink", if(sfdajhbkdgksuhdfjksugdkhfjaksf == null) JSONObject.NULL else sfdajhbkdgksuhdfjksugdkhfjaksf)

        var sdfgjhnbgdfgdfgfhgfnhgghfh = sgfdajhfnlskjfkdjhfahgkfahdjdsf
        val yygujfhgrddhfygjhfgddsghfghj = object: JsonObjectRequest(
            Request.Method.POST, sdfgjhnbgdfgdfgfhgfnhgghfh, fdfydtshgfkfduhgjhskfgddfyusadasd,
            { response ->
                if(response.getBoolean("success")) {
                    sfdjhfjsdkfjhkdhjgfsjkdfndakjfsfdsdf = true
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds
                        .fdglfdjhgkaehgliufshgliufdgdg.settings
                        .javaScriptEnabled = true
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds
                        .fdglfdjhgkaehgliufshgliufdgdg
                        .settings.domStorageEnabled = true
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds
                        .fdglfdjhgkaehgliufshgliufdgdg
                        .settings
                        .allowFileAccessFromFileURLs = true
                    CookieManager.getInstance().setAcceptCookie(true)
                    CookieManager.getInstance().setAcceptThirdPartyCookies(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg, true)
                    val sgffsdgfghfgdhhjhgfhtfdhfgdhhfgch: String = AppsFlyerLib.getInstance().getAppsFlyerUID(this)!!
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.webViewClient = object : WebViewClient() {
                        override fun onPageStarted(yuhgkfhajkeraufgksufsdkajgdytjfshd: WebView?,
                                                   fgdjhgdrghdygjhegrdgf: String?,
                                                   shgdrtytkyuktfjyj: Bitmap?) {
                            super.onPageStarted(yuhgkfhajkeraufgksufsdkajgdytjfshd,
                                fgdjhgdrghdygjhegrdgf,
                                shgdrtytkyuktfjyj)

                        }

                        override fun onPageFinished(zfddssfdhggdsgfjgfh: WebView, fjhgrsgdtndfhfhgfhdfg: String) {
                            gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.visibility = visible2
                            gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                            gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                            gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = gone1
                            jhgafgkuydgfkauregfkdsujhf(fjhgrsgdtndfhfhgfhdfg)
                        }

                        override fun onReceivedHttpError(
                            fdgkgjhgfsdyftgh: WebView?,
                            dsfjlkjslgfijlsld: WebResourceRequest?,
                            dgfliukhfliargsdf: WebResourceResponse?
                        ) {
                            super.onReceivedHttpError(fdgkgjhgfsdyftgh, dsfjlkjslgfijlsld, dgfliukhfliargsdf)
                            fdgjhlifdhfndlghsfukgjdsf(sgffsdgfghfgdhhjhgfhtfdhfgdhhfgch)
                        }

                        @RequiresApi(Build.VERSION_CODES.M)
                        override fun onReceivedError(sgdthgsdrgrgfh: WebView?, ruytrer5yrthgdrh: WebResourceRequest?, oiuytgdrfse: WebResourceError?) {
                            super.onReceivedError(sgdthgsdrgrgfh, ruytrer5yrthgdrh, oiuytgdrfse)
                            fdgjhlifdhfndlghsfukgjdsf(sgffsdgfghfgdhhjhgfhtfdhfgdhhfgch)
                        }
                    }
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.loadUrl(response.getString("url"))
                }
                else{
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                    gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = visible2
                }
            }, { error ->
                gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.etgrsfrrgrtyhjuyrhygrtrfrgsrthyt.visibility = gone1
                gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.ilukjhdflgakjhkfdguhdkukgfadhgl.visibility = gone1
                gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.skgjsfkdgjlfsiukjhslfnkdjghlsigjkhfgdf.visibility = visible2
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val kfdvdjsshjdgfkuydshjffdsf: MutableMap<String,
                        String> = HashMap()
                kfdvdjsshjdgfkuydshjffdsf["Device-UUID"] = gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs!!
                return kfdvdjsshjdgfkuydshjffdsf
            }
        }
        gfdgfjhfdliaughlfdghsldfjdsfsfd.add(yygujfhgrddhfygjhfgddsghfghj)
    }

    private fun fdgjhlifdhfndlghsfukgjdsf(fdhjgajhfdgdshkfusdghgsdad: String) {
        val gfsjhfdlghlihjdlslfjlgsifhgdsf = Volley
            .newRequestQueue(this)
        val dgfslgdjkldfjghsjodkflksadf = JSONObject()
        dgfslgdjkldfjghsjodkflksadf.put("name", "a_e_w")
        val fkghjghdslfkjlsdifhgdksfsdf = JSONObject()
        fkghjghdslfkjlsdifhgdksfsdf
            .put("success", true)
        fkghjghdslfkjlsdifhgdksfsdf
            .put("url", sgfdajhfnlskjfkdjhfahgkfahdjdsf)
        fkghjghdslfkjlsdifhgdksfsdf
            .put("error", fdhjgajhfdgdshkfusdghgsdad)

        dgfslgdjkldfjghsjodkflksadf
            .put("data", fkghjghdslfkjlsdifhgdksfsdf)
        dgfslgdjkldfjghsjodkflksadf
            .put("created", hdfakdsjfgauygfjhdsfkahgfadssafsaf())
        var sfkdsujhfdujhgdsfagdkfjdshfjksad = smfjhdfnlkjdsghjfdbgfdkjhgjsf

        val ljfghiuadfhudgjsdgfkfhdsgfdsffragfdjhgfdsfdsf = object: JsonObjectRequest(
            Request.Method.POST, sfkdsujhfdujhgdsfagdkfjdshfjksad,
            dgfslgdjkldfjghsjodkflksadf,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val hgfdrgtyyjukihjggshrfghgdghdgjfhdgjgdhghdfgdhgh: MutableMap<String, String> = java.util.HashMap()
                hgfdrgtyyjukihjggshrfghgdghdgjfhdgjgdhghdfgdhgh["Device-UUID"] = gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs!!
                return hgfdrgtyyjukihjggshrfghgdghdgjfhdgjgdhghdfgdhgh
            }
        }
        gfsjhfdlghlihjdlslfjlgsifhgdsf.add(ljfghiuadfhudgjsdgfkfhdsgfdsffragfdjhgfdsfdsf)
    }

    private fun jhgafgkuydgfkauregfkdsujhf(hjafjhknjadfjhgvsdfhjaksgdhsf: String) {
        val gfsahjbfkhdsvfhgadvfbjsfad = Volley
            .newRequestQueue(this)
        val sgfhjdafgyfjdhgkahfjgsdfsdfsdfdfa = JSONObject()
        sgfhjdafgyfjdhgkahfjgsdfsdfsdfdfa.put("name", "a_p_f")
        val dfsgnabgkdfjgbjhdfbajhdvfjgdhafvhdfjdhgavfdfsf = JSONObject()
        dfsgnabgkdfjgbjhdfbajhdvfjgdhafvhdfjdhgavfdfsf
            .put("success", true)
        dfsgnabgkdfjgbjhdfbajhdvfjgdhafvhdfjdhgavfdfsf.put("url", hjafjhknjadfjhgvsdfhjaksgdhsf)
        sgfhjdafgyfjdhgkahfjgsdfsdfsdfdfa
            .put("data", dfsgnabgkdfjgbjhdfbajhdvfjgdhafvhdfjdhgavfdfsf)
        sgfhjdafgyfjdhgkahfjgsdfsdfsdfdfa
            .put("created", hdfakdsjfgauygfjhdsfkahgfadssafsaf())
        var sfgakufyjgajhfgjlkfldadfhsd = smfjhdfnlkjdsghjfdbgfdkjhgjsf

        val sfhafhgdsvfhgjgsdkfahgdjhgfghdvfdajhgfdjhgfdsfsad = object: JsonObjectRequest(
            Request.Method.POST, sfgakufyjgajhfgjlkfldadfhsd, sgfhjdafgyfjdhgkahfjgsdfsdfsdfdfa,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val sffjhgfkudsagfgfkslfdjhkdahgfsgdfjhfesfsdf: MutableMap<String, String> = java.util.HashMap()
                sffjhgfkudsagfgfkslfdjhkdahgfsgdfjhfesfsdf["Device-UUID"] = gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs!!
                return sffjhgfkudsagfgfkslfdjhkdahgfsgdfjhfesfsdf
            }
        }
        gfsahjbfkhdsvfhgadvfbjsfad.add(sfhafhgdsvfhgjgsdkfahgdjhgfghdvfdajhgfdjhgfdsfsad)
    }

    private fun hdfakdsjfgauygfjhdsfkahgfadssafsaf(): Long {
        val sfkgajhfdukgyyagdsfhadfuydjshcnvhgfksudyfsf: Date = Calendar.getInstance().time
        return sfkgajhfdukgyyagdsfhadfuydjshcnvhgfksudyfsf.time
    }


    private fun sfdhsjffdjhglfifdhgikfjhkdfgjkdsfhalisufd(sfshfgjdsfkahdsjfbsakfsd: String) {
        val sfdjfhkuhjdbnfmbkesfhjragfhfdafhdnsfbdsfdsfadfag = Volley
            .newRequestQueue(this)
        val zfdjhbgkfdgkduahgfkhfdgkfdhgadhfgkdsfhgkdsfjhgkhdagfuydhfdsf = JSONObject()
        zfdjhbgkfdgkduahgfkhfdgkfdhgadhfgkdsfhgkdsfjhgkhdagfuydhfdsf.put("name", "a_o")
        val sfgjhrkgurafkjhdsgfkauygfkuygsdlfghiguhdsfjkjsuyghadhkjfhgkuyafgfjsafds = JSONObject()
        sfgjhrkgurafkjhdsgfkauygfkuygsdlfghiguhdsfjkjsuyghadhkjfhgkuyafgfjsafds
            .put("success", true)
        zfdjhbgkfdgkduahgfkhfdgkfdhgadhfgkdsfhgkdsfjhgkhdagfuydhfdsf
            .put("data", sfgjhrkgurafkjhdsgfkauygfkuygsdlfghiguhdsfjkjsuyghadhkjfhgkuyafgfjsafds)
        zfdjhbgkfdgkduahgfkhfdgkfdhgadhfgkdsfhgkdsfjhgkhdagfuydhfdsf
            .put("created", hdfakdsjfgauygfjhdsfkahgfadssafsaf())
        var safjhfbkahdfgjydgfjhdsgfjds = smfjhdfnlkjdsghjfdbgfdkjhgjsf
        val sfdakdsuhfdkfaghkdsfsdfsf = object: JsonObjectRequest(
            Request.Method.POST,
            safjhfbkahdfgjydgfjhdsgfjds,
            zfdjhbgkfdgkduahgfkhfdgkfdhgadhfgkdsfhgkdsfjhgkhdagfuydhfdsf,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val ijhdalfkhgjafdhgkjygsdhfkilkhgfaikeugsdf: MutableMap<String, String> = HashMap()
                ijhdalfkhgjafdhgkjygsdhfkilkhgfaikeugsdf["Device-UUID"] = sfshfgjdsfkahdsjfbsakfsd
                return ijhdalfkhgjafdhgkjygsdhfkilkhgfaikeugsdf
            }
        }
        sfdjfhkuhjdbnfmbkesfhjragfhfdafhdnsfbdsfdsfadfag.add(sfdakdsuhfdkfaghkdsfsdfsf)
    }


    private fun skgfjkfsldkgjhksglkdjdlfdsf() {
        val sfgjkfdnghkfdugahlidufghgyhfdukjgadf = Volley
            .newRequestQueue(this)
        val ghghfhjggfhfjcghjvhkghjkgjl = JSONObject()
        ghghfhjggfhfjcghjvhkghjkgjl
            .put("name", "a_o_e")
        val dgjblnfkjnlbfijhkbfdzjkbgxfslfkjghlfidjgdgffdsf = JSONObject()
        dgjblnfkjnlbfijhkbfdzjkbgxfslfkjghlfidjgdgffdsf
            .put("success", true)
        ghghfhjggfhfjcghjvhkghjkgjl
            .put("data", dgjblnfkjnlbfijhkbfdzjkbgxfslfkjghlfidjgdgffdsf)
        ghghfhjggfhfjcghjvhkghjkgjl
            .put("created", hdfakdsjfgauygfjhdsfkahgfadssafsaf())
        var sfhabkfdjhgksuhdjgfvhdjsgfaksfhjgdsbkfjsdf = smfjhdfnlkjdsghjfdbgfdkjhgjsf

        val sgfhvjbfkjhakfhgfjflgshkgljksdhflksfjlsikfdjf = object: JsonObjectRequest(
            Request.Method.POST,
            sfhabkfdjhgksuhdjgfvhdjsgfaksfhjgdsbkfjsdf,
            ghghfhjggfhfjcghjvhkghjkgjl,
            { response ->
            }, { error ->
            }
        ) {
            override fun getHeaders(): Map<String, String> {
                val ajfgughskufdighfdauighkfjgdhsfjkdhglidfjahldfkjsdf: MutableMap<String, String> = HashMap()
                ajfgughskufdighfdauighkfjgdhsfjkdhglidfjahldfkjsdf["Device-UUID"] = gfsdguyhdjflsgfuydgfkudsfjsjfkudgfkdsfkyadfdsgfkygdfaydsgfkdsjygfkdsauyfgs!!
                return ajfgughskufdighfdauighkfjgdhsfjkdhglidfjahldfkjsdf
            }
        }
        sfgjkfdnghkfdugahlidufghgyhfdukjgadf.add(sgfhvjbfkjhakfhgfjflgshkgljksdhflksfjlsikfdjf)
    }
    override fun onKeyDown(dzgfdjhgsgdfjhgdfgfsg: Int, sfgfdghfjhghdygbdsfgtghfdsdhgfh: KeyEvent?): Boolean {
        if ((dzgfdjhgsgdfjhgdfgfsg == KeyEvent.KEYCODE_BACK) && gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.canGoBack()) {
            gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.goBack()
            return true
        }

        return super.onKeyDown(dzgfdjhgsgdfjhgdfgfsg, sfgfdghfjhghdygbdsfgtghfdsdhgfh)
    }
    override fun onBackPressed() {
        if ( gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.isFocused() &&  gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.canGoBack()) {
            gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.fdglfdjhgkaehgliufshgliufdgdg.goBack()
        } else {
        }
    }
    private fun gfkhjfdakughskfdujghsliufklsf() {
        FacebookSdk.sdkInitialize(applicationContext)
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.setApplicationId(rgtsfgtrtwfdgwtrgsf)
        AppLinkData.fetchDeferredAppLinkData(
            this
        ) {
            if(it==null){
                sfdajhbkdgksuhdfjksugdkhfjaksf = it.toString()
            } else {
                sfdajhbkdgksuhdfjksugdkhfjaksf = it.getTargetUri().toString()
            }
        }
    }
    fun adufgkdsufgkudaygfkausdfjosafsafddsf(){
        glfzhjkdlgkjhafdlgjkhldsjkfsdjglkjfdsf()
    }

    private fun glfzhjkdlgkjhafdlgjkhldsjkfsdjglkjfdsf() {
        supportFragmentManager
            .beginTransaction()
            .replace(gerdhfjlkasdfrdhjafblhjgakduhfjbsdjlfhbsfds.gkjfngsljkgnlkgjnglsifjkgndg.id, menu())
            .commit()
    }
}