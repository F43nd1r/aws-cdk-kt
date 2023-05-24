package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnCodeRepository
import software.amazon.awscdk.services.sagemaker.CfnCodeRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCodeRepository(id: String, props: CfnCodeRepositoryProps): CfnCodeRepository
    = CfnCodeRepository(this, id, props)

@Generated
public fun Construct.cfnCodeRepository(
  id: String,
  props: CfnCodeRepositoryProps,
  initializer: @AwsCdkDsl CfnCodeRepository.() -> Unit,
): CfnCodeRepository = CfnCodeRepository(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCodeRepository(id: String, initializer: @AwsCdkDsl
    CfnCodeRepository.Builder.() -> Unit): CfnCodeRepository =
    CfnCodeRepository.Builder.create(this, id).apply(initializer).build()
