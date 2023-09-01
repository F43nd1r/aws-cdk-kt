package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPublicRepository
import software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicRepository(id: String, initializer: @AwsCdkDsl
    CfnPublicRepository.() -> Unit = {}): CfnPublicRepository = CfnPublicRepository(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnPublicRepository(
  id: String,
  props: CfnPublicRepositoryProps,
  initializer: @AwsCdkDsl CfnPublicRepository.() -> Unit = {},
): CfnPublicRepository = CfnPublicRepository(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPublicRepository(id: String, initializer: @AwsCdkDsl
    CfnPublicRepository.Builder.() -> Unit = {}): CfnPublicRepository =
    CfnPublicRepository.Builder.create(this, id).apply(initializer).build()
