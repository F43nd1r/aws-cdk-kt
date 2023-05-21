package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun slotValueElicitationSettingProperty(initializer: CfnBot.SlotValueElicitationSettingProperty.Builder.() -> Unit
    = {}): CfnBot.SlotValueElicitationSettingProperty =
    CfnBot.SlotValueElicitationSettingProperty.builder().apply(initializer).build()
