package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.TreeCloudArtifact

@Generated
public fun buildTreeCloudArtifact(
  assembly: CloudAssembly,
  name: String,
  initializer: @AwsCdkDsl TreeCloudArtifact.Builder.() -> Unit,
): TreeCloudArtifact = TreeCloudArtifact.Builder.create(assembly, name).apply(initializer).build()
