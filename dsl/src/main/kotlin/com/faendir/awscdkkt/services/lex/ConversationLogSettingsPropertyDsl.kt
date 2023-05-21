package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

@Generated
public
    fun conversationLogSettingsProperty(initializer: CfnBotAlias.ConversationLogSettingsProperty.Builder.() -> Unit
    = {}): CfnBotAlias.ConversationLogSettingsProperty =
    CfnBotAlias.ConversationLogSettingsProperty.builder().apply(initializer).build()
