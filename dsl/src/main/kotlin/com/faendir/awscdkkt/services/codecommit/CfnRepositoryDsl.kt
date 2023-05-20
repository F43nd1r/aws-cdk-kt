@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.CfnRepository
import software.amazon.awscdk.services.codecommit.CfnRepositoryProps
import software.constructs.Construct

public fun Construct.cfnRepository(
  id: String,
  props: CfnRepositoryProps,
  initializer: CfnRepository.() -> Unit = {},
): CfnRepository = CfnRepository(this, id, props).apply(initializer)
