@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import software.amazon.awscdk.services.opensearchservice.CfnDomainProps
import software.constructs.Construct

public fun Construct.cfnDomain(id: String, initializer: CfnDomain.() -> Unit = {}): CfnDomain =
    CfnDomain(this, id).apply(initializer)

public fun Construct.cfnDomain(
  id: String,
  props: CfnDomainProps,
  initializer: CfnDomain.() -> Unit = {},
): CfnDomain = CfnDomain(this, id, props).apply(initializer)
