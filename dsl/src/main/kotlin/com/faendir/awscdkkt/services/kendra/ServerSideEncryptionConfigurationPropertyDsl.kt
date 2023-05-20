@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnIndex.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
    CfnIndex.ServerSideEncryptionConfigurationProperty =
    CfnIndex.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
