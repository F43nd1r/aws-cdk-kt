@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.CfnRepositoryProps
import software.constructs.Construct

public fun Construct.cfnRepository(
  id: String,
  props: CfnRepositoryProps,
  initializer: CfnRepository.() -> Unit = {},
): CfnRepository = CfnRepository(this, id, props).apply(initializer)

public fun Construct.cfnRepository(id: String, initializer: CfnRepository.() -> Unit = {}):
    CfnRepository = CfnRepository(this, id).apply(initializer)
