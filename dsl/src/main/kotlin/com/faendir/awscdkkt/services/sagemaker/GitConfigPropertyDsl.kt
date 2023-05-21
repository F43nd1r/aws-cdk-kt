package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository

@Generated
public fun gitConfigProperty(initializer: CfnCodeRepository.GitConfigProperty.Builder.() -> Unit =
    {}): CfnCodeRepository.GitConfigProperty =
    CfnCodeRepository.GitConfigProperty.builder().apply(initializer).build()
