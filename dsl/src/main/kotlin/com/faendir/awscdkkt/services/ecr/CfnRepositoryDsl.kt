package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.CfnRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRepository(id: String, initializer: CfnRepository.() -> Unit = {}):
    CfnRepository = CfnRepository(this, id).apply(initializer)

@Generated
public fun Construct.cfnRepository(
  id: String,
  props: CfnRepositoryProps,
  initializer: CfnRepository.() -> Unit = {},
): CfnRepository = CfnRepository(this, id, props).apply(initializer)
