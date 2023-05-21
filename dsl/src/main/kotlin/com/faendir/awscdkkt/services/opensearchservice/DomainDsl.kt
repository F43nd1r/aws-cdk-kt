package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.Domain
import software.amazon.awscdk.services.opensearchservice.DomainProps
import software.constructs.Construct

@Generated
public fun Construct.domain(
  id: String,
  props: DomainProps,
  initializer: Domain.() -> Unit = {},
): Domain = Domain(this, id, props).apply(initializer)
