@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codeartifact

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codeartifact.CfnDomain
import software.amazon.awscdk.services.codeartifact.CfnDomainProps
import software.constructs.Construct

public fun Construct.cfnDomain(
  id: String,
  props: CfnDomainProps,
  initializer: CfnDomain.() -> Unit = {},
): CfnDomain = CfnDomain(this, id, props).apply(initializer)
