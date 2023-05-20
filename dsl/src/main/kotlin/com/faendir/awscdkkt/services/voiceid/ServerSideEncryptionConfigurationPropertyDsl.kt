@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.voiceid

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.voiceid.CfnDomain

public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
    CfnDomain.ServerSideEncryptionConfigurationProperty =
    CfnDomain.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
