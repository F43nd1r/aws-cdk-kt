package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public fun textLogSettingProperty(initializer: CfnBotAlias.TextLogSettingProperty.Builder.() -> Unit
    = {}): CfnBotAlias.TextLogSettingProperty =
    CfnBotAlias.TextLogSettingProperty.builder().apply(initializer).build()
