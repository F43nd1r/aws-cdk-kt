package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.OpenSearchDataSource
import software.amazon.awscdk.services.appsync.OpenSearchDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.openSearchDataSource(
  id: String,
  props: OpenSearchDataSourceProps,
  initializer: @AwsCdkDsl OpenSearchDataSource.() -> Unit = {},
): OpenSearchDataSource = OpenSearchDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOpenSearchDataSource(id: String, initializer: @AwsCdkDsl OpenSearchDataSource.Builder.() -> Unit = {}): OpenSearchDataSource = OpenSearchDataSource.Builder.create(this, id).apply(initializer).build()
