package com.example.myapplication.login_next.login_next_model

import com.example.myapplication.login_next.FooterMenu
import com.example.myapplication.utility.language_support.Language_Model
import com.example.myapplication.utility.language_support.Language_Settings
import kotlin.properties.Delegates

class ResLoginData {
    var footerMenu: List<FooterMenu> = ArrayList<FooterMenu>()
    private lateinit var userId : String
    private lateinit var compId : String
    private lateinit var fnm : String
    private lateinit var lnm : String
    private lateinit var email : String
    private lateinit var img : String
    private lateinit var udId : String
    var rights: List<Right> = ArrayList<Right>()
    private lateinit var username : String
    private lateinit var duration : String
    private lateinit var token : String
    private var isCompInfoFill : String = "0"
    private lateinit var jobCurrentTime : String
    private lateinit var jobSchedule : String
    lateinit var adminIds: List<String>
    private lateinit var isFWgpsEnable : String
    private lateinit var trkDuration : String
    private lateinit var trkDistance : String
    private lateinit var trkStartingHour : String
    private lateinit var trkEndingHour : String
    private lateinit var lat : String
    private lateinit var lng : String
    private lateinit var isHideContact : String
    private lateinit var version : String
    private lateinit var forceupdate_version : String
    private var isClientEnable : String = "0"
    private var isOnetoOneChatEnable : String = "0"
    private var isActivityLogEnable : String = "0"
    private lateinit var isLock : String
    private var isClientVisible by Delegates.notNull<Int>()
    private lateinit var taxCalculationType : String
    private lateinit var hsnCodeLable : String
    private lateinit var ctryCode : String
    private lateinit var expireStatus : String
    private var isCustomFormEnable : String = "0"
    private var isCustomFieldEnable : String = "0"
    private var isEquipmentEnable : String = "0"
    private var isContractEnable : String = "0"
    private var isEmailLogEnable : String = "0"
    private var isJobItemQuantityFormEnable : String = "0"
    private var isItemEditEnable : String = "0"
    private lateinit var isClientForFutureEnable : String
    private lateinit var isShowRejectStatus : String
    private lateinit var QuotMailConfimation : String
    private lateinit var lastCheckIn : String
    private lateinit var conExtraField1Label : String
    private lateinit var conExtraField2Label : String
    private lateinit var conExtraField3Label : String
    private lateinit var conExtraField4Label : String
    private var isScheduleTextEnable : String = "1"
    private var isAddJobCustomFieldEnable : String = "1"
    private var isAddJobRecurEnable : String = "1"
    private var isJobCrteWthDispatch : String = "1"
    private var isAutoTimeZone : String = "0"
    private lateinit var loginUsrTz : String
    private lateinit var taxShowType : String
    lateinit var AdminIdsWithFBasePerm: List<AdminID>
    private lateinit var isHideContactOnDispatch : String
    private lateinit var isCompleShowMarkDone : String
//    private lateinit var compleMoFldVisiblty : CompleMoFldVisiblty
    private var comp_permission: List<CompPermission> = ArrayList<CompPermission>()
    private lateinit var language : Language_Settings
    lateinit var languageList: List<Language_Model>
    private lateinit var checkId : String
    private lateinit var locId : String
    private var isHideTravelBtn : String = "0"
    private var staticJobId by Delegates.notNull<Int>()
    private lateinit var shiftStartTime : String
    private lateinit var shiftEndTime : String
    private lateinit var isItemDeleteEnable : String
    private lateinit var disCalculationType : String
    private lateinit var isQuotStatusComtEnable : String
    private var checkInOutDuration : String = "10"
    private lateinit var isJobCompCustSignEnable : String
    private lateinit var isComplNoteBeforeComplete : String
//    private var equipmentStatus: List<EquipmentStatus> = ArrayList<EquipmentStatus>()
    private lateinit var is24hrFormatEnable : String


    fun getIsFWgpsEnable():String{
        return isFWgpsEnable
    }


}