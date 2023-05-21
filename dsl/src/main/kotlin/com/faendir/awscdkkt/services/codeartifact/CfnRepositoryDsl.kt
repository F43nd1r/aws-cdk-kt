package com.faendir.awscdkkt.services.codeartifact

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeartifact.CfnRepository
import software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRepository(
  id: String,
  props: CfnRepositoryProps,
  initializer: CfnRepository.() -> Unit = {},
): CfnRepository = CfnRepository(this, id, props).apply(initializer)
