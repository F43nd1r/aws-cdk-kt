package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBot

@Generated
public
    fun slotValueSelectionSettingProperty(initializer: CfnBot.SlotValueSelectionSettingProperty.Builder.() -> Unit
    = {}): CfnBot.SlotValueSelectionSettingProperty =
    CfnBot.SlotValueSelectionSettingProperty.builder().apply(initializer).build()
