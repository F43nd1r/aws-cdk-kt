@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.Domain
import software.amazon.awscdk.services.elasticsearch.DomainProps
import software.constructs.Construct

@Deprecated(message = "software.amazon.awscdk.services.elasticsearch.Domain is deprecated in CDK.")
@Generated
public fun Construct.domain(id: String, props: DomainProps): Domain = Domain(this, id, props)

@Deprecated(message = "software.amazon.awscdk.services.elasticsearch.Domain is deprecated in CDK.")
@Generated
public fun Construct.domain(
  id: String,
  props: DomainProps,
  initializer: @AwsCdkDsl Domain.() -> Unit,
): Domain = Domain(this, id, props).apply(initializer)

@Deprecated(message = "software.amazon.awscdk.services.elasticsearch.Domain is deprecated in CDK.")
@Generated
public fun Construct.buildDomain(id: String, initializer: @AwsCdkDsl Domain.Builder.() -> Unit):
    Domain = Domain.Builder.create(this, id).apply(initializer).build()
