package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cxapi.AssetManifestArtifact
import software.amazon.awscdk.cxapi.CloudAssembly

@Generated
public fun buildAssetManifestArtifact(
  assembly: CloudAssembly,
  name: String,
  initializer: @AwsCdkDsl AssetManifestArtifact.Builder.() -> Unit = {},
): AssetManifestArtifact = AssetManifestArtifact.Builder.create(assembly, name).apply(initializer).build()
