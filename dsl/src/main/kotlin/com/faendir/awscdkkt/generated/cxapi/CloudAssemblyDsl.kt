package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.LoadManifestOptions
import software.amazon.awscdk.cxapi.CloudAssembly

@Generated
public fun cloudAssembly(directory: String): CloudAssembly = CloudAssembly(directory)

@Generated
public fun cloudAssembly(directory: String, loadOptions: LoadManifestOptions): CloudAssembly =
    CloudAssembly(directory, loadOptions)

@Generated
public fun buildCloudAssembly(directory: String, initializer: @AwsCdkDsl
    CloudAssembly.Builder.() -> Unit): CloudAssembly =
    CloudAssembly.Builder.create(directory).apply(initializer).build()
