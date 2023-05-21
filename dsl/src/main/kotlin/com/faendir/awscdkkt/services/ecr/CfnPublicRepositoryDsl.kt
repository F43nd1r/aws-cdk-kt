package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPublicRepository
import software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicRepository(id: String, initializer: CfnPublicRepository.() -> Unit =
    {}): CfnPublicRepository = CfnPublicRepository(this, id).apply(initializer)

@Generated
public fun Construct.cfnPublicRepository(
  id: String,
  props: CfnPublicRepositoryProps,
  initializer: CfnPublicRepository.() -> Unit = {},
): CfnPublicRepository = CfnPublicRepository(this, id, props).apply(initializer)
