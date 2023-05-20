@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
import software.constructs.Construct

public fun Construct.cfnCodeRepository(
  id: String,
  props: CfnCodeRepositoryProps,
  initializer: CfnCodeRepository.() -> Unit = {},
): CfnCodeRepository = CfnCodeRepository(this, id, props).apply(initializer)
