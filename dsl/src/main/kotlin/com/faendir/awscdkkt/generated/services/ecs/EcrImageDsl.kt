package com.faendir.awscdkkt.generated.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.ecs.EcrImage

@Generated
public fun ecrImage(repository: IRepository, tagOrDigest: String): EcrImage = EcrImage(repository,
    tagOrDigest)
