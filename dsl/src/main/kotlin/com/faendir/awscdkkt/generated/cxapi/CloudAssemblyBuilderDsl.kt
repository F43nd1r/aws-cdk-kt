package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder
import software.amazon.awscdk.cxapi.CloudAssemblyBuilderProps

@Generated
public fun cloudAssemblyBuilder(outdir: String): CloudAssemblyBuilder = CloudAssemblyBuilder(outdir)

@Generated
public fun cloudAssemblyBuilder(): CloudAssemblyBuilder = CloudAssemblyBuilder()

@Generated
public fun cloudAssemblyBuilder(outdir: String, props: CloudAssemblyBuilderProps):
    CloudAssemblyBuilder = CloudAssemblyBuilder(outdir, props)

@Generated
public fun buildCloudAssemblyBuilder(outdir: String, initializer: @AwsCdkDsl
    CloudAssemblyBuilder.Builder.() -> Unit): CloudAssemblyBuilder =
    CloudAssemblyBuilder.Builder.create(outdir).apply(initializer).build()

@Generated
public fun buildCloudAssemblyBuilder(initializer: @AwsCdkDsl
    CloudAssemblyBuilder.Builder.() -> Unit): CloudAssemblyBuilder =
    CloudAssemblyBuilder.Builder.create().apply(initializer).build()
