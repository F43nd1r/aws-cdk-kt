package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@Generated
public
    fun sourceConfigurationProperty(initializer: CfnKnowledgeBase.SourceConfigurationProperty.Builder.() -> Unit
    = {}): CfnKnowledgeBase.SourceConfigurationProperty =
    CfnKnowledgeBase.SourceConfigurationProperty.builder().apply(initializer).build()
