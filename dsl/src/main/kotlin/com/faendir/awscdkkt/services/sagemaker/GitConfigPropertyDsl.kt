@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository

public fun gitConfigProperty(initializer: CfnCodeRepository.GitConfigProperty.Builder.() -> Unit):
    CfnCodeRepository.GitConfigProperty =
    CfnCodeRepository.GitConfigProperty.builder().apply(initializer).build()
