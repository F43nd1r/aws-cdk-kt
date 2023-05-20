@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.voiceid

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.voiceid.CfnDomain

public
    fun serverSideEncryptionConfigurationProperty(initializer: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
    CfnDomain.ServerSideEncryptionConfigurationProperty =
    CfnDomain.ServerSideEncryptionConfigurationProperty.builder().apply(initializer).build()
