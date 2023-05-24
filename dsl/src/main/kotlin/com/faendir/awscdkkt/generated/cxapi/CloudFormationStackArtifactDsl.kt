package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.ArtifactManifest
import software.amazon.awscdk.cxapi.CloudAssembly
import software.amazon.awscdk.cxapi.CloudFormationStackArtifact

@Generated
public fun cloudFormationStackArtifact(
  assembly: CloudAssembly,
  artifactId: String,
  artifact: ArtifactManifest,
): CloudFormationStackArtifact = CloudFormationStackArtifact(assembly, artifactId, artifact)

@Generated
public fun buildCloudFormationStackArtifact(
  assembly: CloudAssembly,
  artifactId: String,
  initializer: @AwsCdkDsl CloudFormationStackArtifact.Builder.() -> Unit,
): CloudFormationStackArtifact = CloudFormationStackArtifact.Builder.create(assembly,
    artifactId).apply(initializer).build()
