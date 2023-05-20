@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.wisdom

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnKnowledgeBase

public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
    CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty =
    CfnKnowledgeBase.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
