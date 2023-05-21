package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

@Generated
public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty =
    CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
