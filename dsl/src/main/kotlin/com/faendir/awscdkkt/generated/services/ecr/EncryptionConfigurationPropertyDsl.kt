package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

@Generated
public fun buildEncryptionConfigurationProperty(initializer: @AwsCdkDsl
    CfnRepository.EncryptionConfigurationProperty.Builder.() -> Unit = {}):
    CfnRepository.EncryptionConfigurationProperty =
    CfnRepository.EncryptionConfigurationProperty.Builder().apply(initializer).build()
