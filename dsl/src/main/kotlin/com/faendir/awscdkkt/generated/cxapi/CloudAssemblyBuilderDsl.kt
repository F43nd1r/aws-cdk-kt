package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssemblyBuilder

@Generated
public fun buildCloudAssemblyBuilder(initializer: @AwsCdkDsl
    CloudAssemblyBuilder.Builder.() -> Unit): CloudAssemblyBuilder =
    CloudAssemblyBuilder.Builder.create().apply(initializer).build()

@Generated
public fun buildCloudAssemblyBuilder(outdir: String, initializer: @AwsCdkDsl
    CloudAssemblyBuilder.Builder.() -> Unit): CloudAssemblyBuilder =
    CloudAssemblyBuilder.Builder.create(outdir).apply(initializer).build()
