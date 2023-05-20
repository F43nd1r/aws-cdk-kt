@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
