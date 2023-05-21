package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeRepository(
  id: String,
  props: CfnCodeRepositoryProps,
  initializer: CfnCodeRepository.() -> Unit = {},
): CfnCodeRepository = CfnCodeRepository(this, id, props).apply(initializer)
