package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.amazon.awscdk.services.elasticsearch.CfnDomainProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomain(id: String, initializer: CfnDomain.() -> Unit = {}): CfnDomain =
    CfnDomain(this, id).apply(initializer)

@Generated
public fun Construct.cfnDomain(
  id: String,
  props: CfnDomainProps,
  initializer: CfnDomain.() -> Unit = {},
): CfnDomain = CfnDomain(this, id, props).apply(initializer)
