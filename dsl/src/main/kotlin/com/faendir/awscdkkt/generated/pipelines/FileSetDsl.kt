package com.faendir.awscdkkt.generated.pipelines

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.pipelines.FileSet
import software.amazon.awscdk.pipelines.Step

@Generated
public fun fileSet(id: String): FileSet = FileSet(id)

@Generated
public fun fileSet(id: String, producer: Step): FileSet = FileSet(id, producer)
