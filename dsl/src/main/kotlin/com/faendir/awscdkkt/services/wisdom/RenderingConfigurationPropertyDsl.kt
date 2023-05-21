package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@Generated
public
    fun renderingConfigurationProperty(initializer: CfnKnowledgeBase.RenderingConfigurationProperty.Builder.() -> Unit
    = {}): CfnKnowledgeBase.RenderingConfigurationProperty =
    CfnKnowledgeBase.RenderingConfigurationProperty.builder().apply(initializer).build()
