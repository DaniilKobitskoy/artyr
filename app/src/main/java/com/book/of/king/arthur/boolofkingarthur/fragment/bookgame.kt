package com.book.of.king.arthur.boolofkingarthur.fragment

import android.animation.LayoutTransition
import android.os.CountDownTimer
import android.view.View
import android.view.animation.AnimationUtils
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.transition.AutoTransition
import androidx.transition.TransitionManager
import com.book.of.king.arthur.boolofkingarthur.R
import com.book.of.king.arthur.boolofkingarthur.databinding.FragmentBookgameBinding
import com.book.of.king.arthur.boolofkingarthur.historyArtyr
import com.book.of.king.arthur.boolofkingarthur.pak.adapter.adapt
import java.util.*


var ksjgiudhsfuishdjlifjkhoiurehfsdf: CountDownTimer? = null
var gljfdkngilkdjgnlfsjkdbglkdjsfjoesjdhffhsjgdbdndsf: CountDownTimer? = null
var slifuhgfdaihglshjdkfldajskghjfdbnsfasd: CountDownTimer? = null
var audfhejsikfzdfhkgfdkjhfsoiasldjkfjhdkjsdkal: CountDownTimer? = null
var khfdjafshsiuhglifkdhfskjdbkgshfdhrbfds: CountDownTimer? = null
var adsiyhjhseurydgfhjesdgfbkhfsjdkahfsesidjkalsdshdfjjsad: CountDownTimer? = null
var dsahfdhurhdafjoudihfsf: CountDownTimer? = null
var sdasfuahgusfdihsfjkaofgsduffsdsdfdgsdafd: CountDownTimer? = null
lateinit var rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf: ConstraintLayout
val rsifdueaijfghurithgsoviugufskjhdlgiudghosughugggadogrgdkgfjharoidf: Random = Random()
var gone = View.GONE
var visible = View.VISIBLE
class bookgame : adapt <FragmentBookgameBinding>(FragmentBookgameBinding::inflate) {

    override fun wurshjhfosuguyguydrgaruygfhgfsfadgfs(){

        rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf = eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.arthyr
        if(dsrafjiurtshkdjfiuskdlfasfd.shagnumber.value != null){
        }
        else{
            dsrafjiurtshkdjfiuskdlfasfd.shagnumber.value = 0
        }
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
            .kjmhvgncbfvdsfghfgjmhfndbsf.setOnClickListener {
            eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                .jfdssfgnhfdbgdgfhbc.visibility = gone
            eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                .kjmhvgncbfvdsfghfgjmhfndbsf.visibility = gone

            when(rsifdueaijfghurithgsoviugufskjhdlgiudghosughugggadogrgdkgfjharoidf
                .nextInt(3)){
                0->dskhgjosuifhgijskfsffsd(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                    .mhgnbfvdghghjkhmgndfcvfg)
                1->dskhgjosuifhgijskfsffsd(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                    .kjhgfdgfhgjhmngbffgfdgfhndgb)
                2->dskhgjosuifhgijskfsffsd(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                    .ghmjfgdfhbnghcjygfgb)
            }
            dscgthyyhfdgffrghjfhgragethrtgvefwrsd()
        }

        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
            .gfafdghfgsggdsdfdsres.setOnClickListener {
            efrsgtdhyjufhtgfrrgthfyht(0)
        }
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
            .hgfdsrgdthgnfbfdsv.setOnClickListener {
            efrsgtdhyjufhtgfrrgthfyht(1)
        }
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
            .gfafdghfgsggdsdfdsres.setOnClickListener {
            efrsgtdhyjufhtgfrrgthfyht(2)
        }


    }

    private fun dskhgjosuifhgijskfsffsd(dfghhgtfrdefgthfgfrsgtdfdewgrfferrzsd: View){
        val v = View.VISIBLE
        dfghhgtfrdefgthfgfrsgtdfdewgrfferrzsd.visibility = v
        val bgkfjhblifhbufzdygfdvhgerihvgflfdbvidvxg = AnimationUtils.loadAnimation(requireContext(),
            R.anim.givebottomfruits)
        dfghhgtfrdefgthfgfrsgtdfdewgrfferrzsd.startAnimation(bgkfjhblifhbufzdygfdvhgerihvgflfdbvidvxg)
        sdasfuahgusfdihsfjkaofgsduffsdsdfdgsdafd = object : CountDownTimer(1000, 1000) {
            override fun onTick(ksfdhjhorughoruhdfouadfhewf: Long) {}
            override fun onFinish() {
                var v = View.GONE
                dfghhgtfrdefgthfgfrsgtdfdewgrfferrzsd
                    .visibility = v
                sdasfuahgusfdihsfjkaofgsduffsdsdfdgsdafd?.cancel()
            }
        }.start()
    }




    override fun onDestroy() {
        super.onDestroy()
        dsjkfldjgiursthgjprtsihgjsfhjvsdhfeiusf()
    }


    override fun onStop() {
        super.onStop()
        dsjkfldjgiursthgjprtsihgjsfhjvsdhfeiusf()
    }



    override fun onPause() {
        super.onPause()
        dsjkfldjgiursthgjprtsihgjsfhjvsdhfeiusf()
    }
    private fun dsjkfldjgiursthgjprtsihgjsfhjvsdhfeiusf(){
        ksjgiudhsfuishdjlifjkhoiurehfsdf?.cancel()
        gljfdkngilkdjgnlfsjkdbglkdjsfjoesjdhffhsjgdbdndsf?.cancel()
        slifuhgfdaihglshjdkfldajskghjfdbnsfasd?.cancel()
        audfhejsikfzdfhkgfdkjhfsoiasldjkfjhdkjsdkal?.cancel()
        khfdjafshsiuhglifkdhfskjdbkgshfdhrbfds?.cancel()
        adsiyhjhseurydgfhjesdgfbkhfsjdkahfsesidjkalsdshdfjjsad?.cancel()
        dsahfdhurhdafjoudihfsf?.cancel()
        sdasfuahgusfdihsfjkaofgsduffsdsdfdgsdafd?.cancel()
    }

    private fun hsiuhudshfuhfoaeygfdsdad(zdfSHLIFUhdfliuDhsfliDSUhf: View){
        hfbvkshjbkfdjhgbkuyfdgkfud(zlfdkgukysgdfudfdsf = zdfSHLIFUhdfliuDhsfliDSUhf)
    }

    private fun hfbvkshjbkfdjhgbkuyfdgkfud(zlfdkgukysgdfudfdsf: View) {
        val skjhgdkuayfgkdfuygakfysfsdf = AnimationUtils.loadAnimation(requireContext(), R.anim.rights)
        skjhgdkuayfgkdfuygakfysfsdf
            .fillAfter = true
        zlfdkgukysgdfudfdsf
            .startAnimation(skjhgdkuayfgkdfuygakfysfsdf)
    }

    private fun hgkahjfgkufjhasda(dgfghjghfgdsafghjhgfdasfsfdghb: View, khjzgkduyfgkuyshdjgfkudsygfkdshfgsjadakdhjgsdfs: Int, fgdasdgfdhbtfhgbtfhgv: Int){
        hsiuhudshfuhfoaeygfdsdad(dgfghjghfgdsafghjhgfdasfsfdghb)
        ksjgiudhsfuishdjlifjkhoiurehfsdf = object : CountDownTimer(700, 700) {
            override fun onTick(dfghjhgfdsdfyujnbvdrthbvcdfhhgfdfvcf: Long) {}
            override fun onFinish() {
                ksjgiudhsfuishdjlifjkhoiurehfsdf?.cancel()
                rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf.layoutTransition
                    .enableTransitionType(LayoutTransition.CHANGING)
                val dfghfdgfgfdvdgffdfbhgfhdf = ConstraintSet()
                dfghfdgfgfdvdgffdfbhgfhdf
                    .clone(rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf)
                kjhfdgkaugfkuydsgfygajhdfgdsyfhgajsdhf(dfghfdgfgfdvdgffdfbhgfhdf, khjzgkduyfgkuyshdjgfkudsygfkdshfgsjadakdhjgsdfs,fgdasdgfdhbtfhgbtfhgv)
                TransitionManager
                    .beginDelayedTransition(rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf, AutoTransition().setStartDelay(5000))
                dfghfdgfgfdvdgffdfbhgfhdf
                    .applyTo(rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf)
            }
        }.start()
    }

    private fun kjhfdgkaugfkuydsgfygajhdfgdsyfhgajsdhf(shgfdgkafuhdsgkfahejgfkbhdsjf: ConstraintSet, agdhsfjyhgfyhdsgafjydshgfhasfda: Int, shfdkhgdfjsgfdshgfsjfgsdf: Int) {
        shgfdgkafuhdsgkfahejgfkbhdsjf
            .clear(agdhsfjyhgfyhdsgafjydshgfhasfda, ConstraintSet.LEFT)
        shgfdgkafuhdsgkfahejgfkbhdsjf
            .clear(agdhsfjyhgfyhdsgafjydshgfhasfda, ConstraintSet.TOP)
        shgfdgkafuhdsgkfahejgfkbhdsjf
            .connect(agdhsfjyhgfyhdsgafjydshgfhasfda, ConstraintSet.LEFT, agdhsfjyhgfyhdsgafjydshgfhasfda, ConstraintSet.LEFT)
        shgfdgkafuhdsgkfahejgfkbhdsjf
            .connect(agdhsfjyhgfyhdsgafjydshgfhasfda, ConstraintSet.BOTTOM, shfdkhgdfjsgfdshgfsjfgsdf, ConstraintSet.TOP, R.dimen.dp25
        )
    }

    private fun hgkhjguyjgafyeugfhwliualdkjyerathgfkjshafasd(afkukGEKUFYGKSUYewtfghdsjdkuyagfhasd: View){
        dfsdghsughlafufshdsfad(sfjkdkfishgfdkjllgshjdgfahldkjfsadad = afkukGEKUFYGKSUYewtfghdsjdkuyagfhasd)

    }

    private fun dfsdghsughlafufshdsfad(sfjkdkfishgfdkjllgshjdgfahldkjfsadad: View) {
        val ertefsuiajodijofeoijefoijoifhodisahoidsf = AnimationUtils
            .loadAnimation(requireContext(),
            R.anim.left)
        ertefsuiajodijofeoijefoijoifhodisahoidsf
            .fillAfter = true
        sfjkdkfishgfdkjllgshjdgfahldkjfsadad
            .startAnimation(ertefsuiajodijofeoijefoijoifhodisahoidsf)
    }

    private fun kjhgfkdjhgksuydfhgkdsfygdsafdshgfg(skaudgfehgasfhgjedsfgyf: View, sadfgksjGDKUYETKSFUYHDGSKFEsf: Int, sfdahjgakruygfkydjhsgffdsfsef: Int){
        hgkhjguyjgafyeugfhwliualdkjyerathgfkjshafasd(skaudgfehgasfhgjedsfgyf)
        gljfdkngilkdjgnlfsjkdbglkdjsfjoesjdhffhsjgdbdndsf = object : CountDownTimer(700, 700) {
            override fun onTick(sfhgkdajhfgkhkgsfhjgsfyhsjgfef: Long) {}
            override fun onFinish() {
                gljfdkngilkdjgnlfsjkdbglkdjsfjoesjdhffhsjgdbdndsf?.cancel()
                rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf
                    .layoutTransition
                    .enableTransitionType(LayoutTransition.CHANGING)
                val saduygarkuydfgkdsyhjgfjhdsfgsaa = ConstraintSet()
                saduygarkuydfgkdsyhjgfjhdsfgsaa
                    .clone(rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf)
                kjhfdgkaugfkuydsgfygajhdfgdsyfhgajsdhf(saduygarkuydfgkdsyhjgfjhdsfgsaa, sadfgksjGDKUYETKSFUYHDGSKFEsf,sfdahjgakruygfkydjhsgffdsfsef)
                TransitionManager
                    .beginDelayedTransition(rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf, AutoTransition().setStartDelay(5000))
                saduygarkuydfgkdsyhjgfjhdsfgsaa
                    .applyTo(rdgfhjhfgjiouhdusghdsfjslfjsodyufgsf)
            }
        }.start()
    }

    private fun dscgthyyhfdgffrghjfhgragethrtgvefwrsd(){

        slifuhgfdaihglshjdkfldajskghjfdbnsfasd = object : CountDownTimer(2000, 2000) {
            override fun onTick(saghfkadghfkhjsfsfdasd: Long) {}
            override fun onFinish() {
                jhbkdjhfgbkyhagdkfhesfyahdgfjdshfhgjsfyagfsada()
                hgkahjfgkufjhasda(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                    .ghfgjhdgffbfdgfbfsfb, R.id
                    .ghfgjhdgffbfdgfbfsfb, R.id
                    .jhgfdsxjhgnbdfgfdgb)
                slifuhgfdaihglshjdkfldajskghjfdbnsfasd?.cancel()

            }
        }.start()
    }

    private fun jhbkdjhfgbkyhagdkfhesfyahdgfjdshfhgjsfyagfsada(){
        audfhejsikfzdfhkgfdkjhfsoiasldjkfjhdkjsdkal = object : CountDownTimer(2000, 2000) {
            override fun onTick(gfdsfghfgjfydghdfghbgdfggfdgjhdfg: Long) {}
            override fun onFinish() {
                fgfdrdghfbgrhsjdgfnbgrhgnfbgdhtgbfgrhtgf()
                kjhgfkdjhgksuydfhgkdsfygdsafdshgfg(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                    .kmjhngbfvdsgdnhbfd, R.id
                    .kmjhngbfvdsgdnhbfd, R.id
                    .jhgfdsxjhgnbdfgfdgb)

                audfhejsikfzdfhkgfdkjhfsoiasldjkfjhdkjsdkal?.cancel()
            }
        }.start()
    }

    private fun fgfdrdghfbgrhsjdgfnbgrhgnfbgdhtgbfgrhtgf(){
        dghhfdghjbhgfdtyjngfbhcgjvghgf()
        khfdjafshsiuhglifkdhfskjdbkgshfdhrbfds = object : CountDownTimer(2000, 2000) {
            override fun onTick(sfgdsfhgdkfuygadskfhdsgfdjfasd: Long) {}
            override fun onFinish() {
                kjhgfkdjhgksuydfhgkdsfygdsafdshgfg(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.ghfddgtthyknbvfdgdf, R.id
                    .ghfddgtthyknbvfdgdf,
                    R.id
                        .gfafdghfgsggdsdfdsres)
                eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.kjhgfedfrgthygjjhgfd
                    .visibility = visible
                khfdjafshsiuhglifkdhfskjdbkgshfdhrbfds?.cancel()
            }
        }.start()
    }

    private fun dghhfdghjbhgfdtyjngfbhcgjvghgf(){
        adsiyhjhseurydgfhjesdgfbkhfsjdkahfsesidjkalsdshdfjjsad = object : CountDownTimer(1000, 1000) {
            override fun onTick(dfhuagfkduhglfihushdgjbkshfsukdjhgfksdf: Long) {}
            override fun onFinish() {
                hgkahjfgkufjhasda(eufhoeriy75uriehfo87tyoerufhaeiuyfg76432
                    .kjhgfedfrgthygjjhgfd, R.id
                    .kjhgfedfrgthygjjhgfd, R.id
                    .hngbfddfgnbdfbgfhgfcb)
                eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb
                    .visibility = visible
                kfjfhkhjdbnksjhfgkdjshgfbasjfhdsf()
                adsiyhjhseurydgfhjesdgfbkhfsjdkahfsesidjkalsdshdfjjsad?.cancel()
            }
        }.start()
    }

    private fun kfjfhkhjdbnksjhfgkdjshgfbasjfhdsf(){
        dsahfdhurhdafjoudihfsf = object : CountDownTimer(1200, 1200) {
            override fun onTick(dgfdkhjnhlkgfzdjglkSJdfnlgfkgzjhdksad: Long) {}
            override fun onFinish() {
                fjhkjkdsgslfkjgflkvfhjdhfkdslf()
            }
        }.start()

    }

    private fun fjhkjkdsgslfkjgflkvfhjdhfkdslf() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres
            .visibility = visible
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jfdssfgnhfdbgdgfhbc
            .visibility = visible
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv
            .visibility = visible
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jhgfdsxjhgnbdfgfdgb
            .visibility = gone
        dsahfdhurhdafjoudihfsf?.cancel()
    }

    private fun efrsgtdhyjufhtgfrrgthfyht(dfkhjgskufdjghusfdjhkglskdjfkofkdgjs: Int){
        val dgfjkhfdlfiuewgdiuyghfjgiudhfksfs = rsifdueaijfghurithgsoviugufskjhdlgiudghosughugggadogrgdkgfjharoidf
            .nextInt(3)
        if(dfkhjgskufdjghusfdjhkglskdjfkofkdgjs==dgfjkhfdlfiuewgdiuyghfjgiudhfksfs && dgfjkhfdlfiuewgdiuyghfjgiudhfksfs==0){
            sgfdkhjhjifdkjkasd()
        }
        if(dfkhjgskufdjghusfdjhkglskdjfkofkdgjs==dgfjkhfdlfiuewgdiuyghfjgiudhfksfs && dgfjkhfdlfiuewgdiuyghfjgiudhfksfs==1){
            gfdsafgjhmbdfghjhkjmbvfdsfghg()
        }
        if(dfkhjgskufdjghusfdjhkglskdjfkofkdgjs==dgfjkhfdlfiuewgdiuyghfjgiudhfksfs && dgfjkhfdlfiuewgdiuyghfjgiudhfksfs==2){
            ygjhnbgsdgdhgfbvdsgjhnfhfgh()
        }
        if(dfkhjgskufdjghusfdjhkglskdjfkofkdgjs!=dgfjkhfdlfiuewgdiuyghfjgiudhfksfs){
            when(dgfjkhfdlfiuewgdiuyghfjgiudhfksfs){
                0-> {
                    sfjhjgdlfajdsnlkflasf()
                }
                1-> {
                    dfkhdjhskaljfdfkjhfskaks()
                }
                2-> {
                    slkjdsfjduhgajksdflasd()
                }
            }
            eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jfdssfgnhfdbgdgfhbc.text = resources
                .getString(R.string.xyi)
            dsrafjiurtshkdjfiuskdlfasfd.shagnumber.value = null
        }
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.kjmhvgncbfvdsfghfgjmhfndbsf.setOnClickListener {
            (activity as historyArtyr).adufgkdsufgkudaygfkausdfjosafsafddsf()
        }
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.kjmhvgncbfvdsfghfgjmhfndbsf.text = resources
            .getString(R.string.goeshe)
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.kjmhvgncbfvdsfghfgjmhfndbsf.visibility = visible
    }
    private fun gfdsafgjhmbdfghjhkjmbvfdsfghg() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jfdssfgnhfdbgdgfhbc.text = resources
            .getString(R.string.yeah)
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv.setImageDrawable(resources
            .getDrawable(R.drawable.bookwin))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
    }
    private fun sgfdkhjhjifdkjkasd() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jfdssfgnhfdbgdgfhbc.text = resources
            .getString(R.string.yeah)
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres.setImageDrawable(resources
            .getDrawable(R.drawable.bookwin))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
    }
    private fun ygjhnbgsdgdhgfbvdsgjhnfhfgh() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jfdssfgnhfdbgdgfhbc.text = resources.getString(R.string.yeah)
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb.setImageDrawable(resources
            .getDrawable(R.drawable.bookwin))
    }
    private fun slkjdsfjduhgajksdflasd() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv.setImageDrawable(resources
            .getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb.setImageDrawable(resources
            .getDrawable(R.drawable.bookwin))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.jfdssfgnhfdbgdgfhbc.text = resources
            .getString(R.string.yeah)
    }


    private fun dfkhdjhskaljfdfkjhfskaks() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres.setImageDrawable(resources.getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv.setImageDrawable(resources.getDrawable(R.drawable.bookwin))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb.setImageDrawable(resources.getDrawable(R.drawable.blankbook))
    }


    private fun sfjhjgdlfajdsnlkflasf() {
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.gfafdghfgsggdsdfdsres.setImageDrawable(resources.getDrawable(R.drawable.bookwin))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hgfdsrgdthgnfbfdsv.setImageDrawable(resources.getDrawable(R.drawable.blankbook))
        eufhoeriy75uriehfo87tyoerufhaeiuyfg76432.hngbfddfgnbdfbgfhgfcb.setImageDrawable(resources.getDrawable(R.drawable.blankbook))

    }


    }
