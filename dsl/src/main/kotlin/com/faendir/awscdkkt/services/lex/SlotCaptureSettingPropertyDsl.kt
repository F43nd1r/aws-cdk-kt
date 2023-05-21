package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun slotCaptureSettingProperty(initializer: CfnBot.SlotCaptureSettingProperty.Builder.() -> Unit
    = {}): CfnBot.SlotCaptureSettingProperty =
    CfnBot.SlotCaptureSettingProperty.builder().apply(initializer).build()
