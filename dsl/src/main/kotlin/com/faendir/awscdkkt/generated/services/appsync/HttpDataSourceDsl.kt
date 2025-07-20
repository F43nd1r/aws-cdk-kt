package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.HttpDataSource
import software.amazon.awscdk.services.appsync.HttpDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.httpDataSource(
  id: String,
  props: HttpDataSourceProps,
  initializer: @AwsCdkDsl HttpDataSource.() -> Unit = {},
): HttpDataSource = HttpDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHttpDataSource(id: String, initializer: @AwsCdkDsl HttpDataSource.Builder.() -> Unit = {}): HttpDataSource = HttpDataSource.Builder.create(this, id).apply(initializer).build()
