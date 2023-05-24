package com.faendir.awscdkkt.generated.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath

@Generated
public fun artifactPath(artifact: Artifact, fileName: String): ArtifactPath = ArtifactPath(artifact,
    fileName)
