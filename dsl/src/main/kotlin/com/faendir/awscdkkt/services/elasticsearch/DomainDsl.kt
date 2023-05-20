@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.Domain
import software.amazon.awscdk.services.elasticsearch.DomainProps
import software.constructs.Construct

public fun Construct.domain(
  id: String,
  props: DomainProps,
  initializer: Domain.() -> Unit = {},
): Domain = Domain(this, id, props).apply(initializer)
