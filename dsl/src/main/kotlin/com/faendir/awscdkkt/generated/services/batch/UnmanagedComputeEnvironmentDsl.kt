package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.UnmanagedComputeEnvironment
import software.amazon.awscdk.services.batch.UnmanagedComputeEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.unmanagedComputeEnvironment(id: String, initializer: @AwsCdkDsl UnmanagedComputeEnvironment.() -> Unit = {}): UnmanagedComputeEnvironment = UnmanagedComputeEnvironment(this, id).apply(initializer)

@Generated
public fun Construct.unmanagedComputeEnvironment(
  id: String,
  props: UnmanagedComputeEnvironmentProps,
  initializer: @AwsCdkDsl UnmanagedComputeEnvironment.() -> Unit = {},
): UnmanagedComputeEnvironment = UnmanagedComputeEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildUnmanagedComputeEnvironment(id: String, initializer: @AwsCdkDsl UnmanagedComputeEnvironment.Builder.() -> Unit = {}): UnmanagedComputeEnvironment = UnmanagedComputeEnvironment.Builder.create(this, id).apply(initializer).build()
