package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact

@Generated
public fun buildNestedCloudAssemblyArtifact(
  assembly: CloudAssembly,
  name: String,
  initializer: @AwsCdkDsl NestedCloudAssemblyArtifact.Builder.() -> Unit = {},
): NestedCloudAssemblyArtifact = NestedCloudAssemblyArtifact.Builder.create(assembly,
    name).apply(initializer).build()
