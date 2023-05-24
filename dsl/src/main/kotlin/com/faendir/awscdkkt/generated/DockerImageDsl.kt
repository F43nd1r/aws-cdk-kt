package com.faendir.awscdkkt.generated

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.DockerImage

@Generated
public fun dockerImage(image: String): DockerImage = DockerImage(image)

@Generated
public fun dockerImage(image: String, _imageHash: String): DockerImage = DockerImage(image,
    _imageHash)
