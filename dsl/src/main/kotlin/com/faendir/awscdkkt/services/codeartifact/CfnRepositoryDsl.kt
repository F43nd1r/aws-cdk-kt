@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codeartifact

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeartifact.CfnRepository
import software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
import software.constructs.Construct

public fun Construct.cfnRepository(
  id: String,
  props: CfnRepositoryProps,
  initializer: CfnRepository.() -> Unit = {},
): CfnRepository = CfnRepository(this, id, props).apply(initializer)
