package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public
    fun audioLogSettingProperty(initializer: CfnBotAlias.AudioLogSettingProperty.Builder.() -> Unit
    = {}): CfnBotAlias.AudioLogSettingProperty =
    CfnBotAlias.AudioLogSettingProperty.builder().apply(initializer).build()
