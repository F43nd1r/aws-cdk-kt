package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.TreeCloudArtifact

@Generated
public fun treeCloudArtifact(
  assembly: CloudAssembly,
  name: String,
  artifact: ArtifactManifest,
): TreeCloudArtifact = TreeCloudArtifact(assembly, name, artifact)

@Generated
public fun buildTreeCloudArtifact(
  assembly: CloudAssembly,
  name: String,
  initializer: @AwsCdkDsl TreeCloudArtifact.Builder.() -> Unit,
): TreeCloudArtifact = TreeCloudArtifact.Builder.create(assembly, name).apply(initializer).build()
