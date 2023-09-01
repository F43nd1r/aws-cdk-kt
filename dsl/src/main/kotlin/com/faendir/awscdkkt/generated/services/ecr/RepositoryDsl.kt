package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.ecr.RepositoryProps
import software.constructs.Construct

@Generated
public fun Construct.repository(id: String, initializer: @AwsCdkDsl Repository.() -> Unit = {}):
    Repository = Repository(this, id).apply(initializer)

@Generated
public fun Construct.repository(
  id: String,
  props: RepositoryProps,
  initializer: @AwsCdkDsl Repository.() -> Unit = {},
): Repository = Repository(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRepository(id: String, initializer: @AwsCdkDsl
    Repository.Builder.() -> Unit = {}): Repository = Repository.Builder.create(this,
    id).apply(initializer).build()
