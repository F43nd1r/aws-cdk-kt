package com.faendir.awscdkkt.generated.services.opensearchservice

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl Domain.() -> Unit = {},
): Domain = Domain(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDomain(id: String, initializer: @AwsCdkDsl Domain.Builder.() -> Unit = {}): Domain = Domain.Builder.create(this, id).apply(initializer).build()
